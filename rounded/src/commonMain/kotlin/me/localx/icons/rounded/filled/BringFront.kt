package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.BringFront: ImageVector
    get() {
        if (_bringFront != null) {
            return _bringFront!!
        }
        _bringFront = Builder(name = "BringFront", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.58f, 0.0f, 1.0f, -0.56f, 0.84f, -1.12f)
                curveToRelative(-0.48f, -1.66f, -2.02f, -2.88f, -3.84f, -2.88f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.79f, 0.0f, 0.0f, 1.79f, 0.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.82f, 1.22f, 3.36f, 2.88f, 3.84f)
                curveToRelative(0.56f, 0.16f, 1.12f, -0.26f, 1.12f, -0.84f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.58f, 0.0f, -1.0f, 0.56f, -0.84f, 1.12f)
                curveToRelative(0.48f, 1.66f, 2.02f, 2.88f, 3.84f, 2.88f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.82f, -1.22f, -3.36f, -2.88f, -3.84f)
                curveToRelative(-0.56f, -0.16f, -1.12f, 0.26f, -1.12f, 0.84f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _bringFront!!
    }

private var _bringFront: ImageVector? = null
