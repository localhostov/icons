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

public val Icons.Filled.DrawSquare: ImageVector
    get() {
        if (_drawSquare != null) {
            return _drawSquare!!
        }
        _drawSquare = Builder(name = "DrawSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 18.172f)
                lineTo(22.0f, 5.828f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.524f, 2.0f, -2.828f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                lineTo(5.828f, 2.0f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(12.344f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, -0.836f, 2.828f, -2.0f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, -0.836f, -2.415f, -2.0f, -2.828f)
                close()
                moveTo(18.172f, 20.0f)
                lineTo(5.828f, 20.0f)
                curveToRelative(-0.302f, -0.851f, -0.977f, -1.526f, -1.828f, -1.828f)
                lineTo(4.0f, 5.828f)
                curveToRelative(0.851f, -0.302f, 1.526f, -0.977f, 1.828f, -1.828f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.302f, 0.851f, 0.977f, 1.526f, 1.828f, 1.828f)
                verticalLineToRelative(12.344f)
                curveToRelative(-0.851f, 0.302f, -1.526f, 0.977f, -1.828f, 1.828f)
                close()
            }
        }
        .build()
        return _drawSquare!!
    }

private var _drawSquare: ImageVector? = null
