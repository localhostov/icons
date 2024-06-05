package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.BoxDollar: ImageVector
    get() {
        if (_boxDollar != null) {
            return _boxDollar!!
        }
        _boxDollar = Builder(name = "BoxDollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.48f, 17.76f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                curveToRelative(0.0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.34f, 0.0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0.0f, 0.31f, 0.22f, 0.57f, 0.52f, 0.62f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0.0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                horizontalLineToRelative(-0.38f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.34f, 0.0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0.0f, -0.31f, -0.22f, -0.57f, -0.52f, -0.62f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.34f, 1.34f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _boxDollar!!
    }

private var _boxDollar: ImageVector? = null
