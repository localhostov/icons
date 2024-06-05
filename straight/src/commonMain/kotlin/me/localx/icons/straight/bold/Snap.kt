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

public val Icons.Bold.Snap: ImageVector
    get() {
        if (_snap != null) {
            return _snap!!
        }
        _snap = Builder(name = "Snap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.41f, 6.351f)
                lineToRelative(-2.064f, -2.176f)
                lineToRelative(2.647f, -2.513f)
                lineToRelative(2.064f, 2.176f)
                lineToRelative(-2.647f, 2.513f)
                close()
                moveTo(5.431f, 4.143f)
                lineTo(2.751f, 1.63f)
                lineTo(0.698f, 3.818f)
                lineToRelative(2.68f, 2.513f)
                lineToRelative(2.053f, -2.188f)
                close()
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(17.133f, 9.492f)
                lineToRelative(4.211f, -4.02f)
                curveToRelative(0.54f, -0.516f, 0.671f, -1.382f, 0.249f, -1.998f)
                curveToRelative(-0.538f, -0.785f, -1.612f, -0.866f, -2.271f, -0.237f)
                lineToRelative(-10.952f, 10.454f)
                lineToRelative(-0.255f, -3.406f)
                curveToRelative(-0.076f, -1.125f, -1.049f, -1.975f, -2.174f, -1.899f)
                curveToRelative(-1.125f, 0.076f, -1.975f, 1.049f, -1.899f, 2.174f)
                lineToRelative(0.542f, 9.055f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(4.405f)
                lineToRelative(4.418f, -4.255f)
                lineToRelative(-0.162f, -2.166f)
                lineToRelative(6.229f, -5.946f)
                lineToRelative(4.293f, 7.73f)
                lineToRelative(-4.858f, 4.637f)
                horizontalLineToRelative(4.345f)
                lineToRelative(4.261f, -4.067f)
                lineToRelative(-5.798f, -10.44f)
                close()
            }
        }
        .build()
        return _snap!!
    }

private var _snap: ImageVector? = null
