package me.localx.icons.straight.bold

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

public val Icons.Bold.BoxDollar: ImageVector
    get() {
        if (_boxDollar != null) {
            return _boxDollar!!
        }
        _boxDollar = Builder(name = "BoxDollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(6.5f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 3.5f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-1.45f, 0.0f, -2.62f, 1.18f, -2.62f, 2.62f)
                curveToRelative(0.0f, 1.29f, 0.92f, 2.38f, 2.19f, 2.59f)
                lineToRelative(3.28f, 0.55f)
                curveToRelative(0.3f, 0.05f, 0.52f, 0.31f, 0.52f, 0.62f)
                curveToRelative(0.0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 21.0f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-7.02f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.45f, 0.0f, 2.62f, -1.18f, 2.62f, -2.62f)
                curveToRelative(0.0f, -1.29f, -0.92f, -2.38f, -2.19f, -2.59f)
                lineToRelative(-3.28f, -0.55f)
                curveToRelative(-0.3f, -0.05f, -0.52f, -0.31f, -0.52f, -0.62f)
                curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.02f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _boxDollar!!
    }

private var _boxDollar: ImageVector? = null
