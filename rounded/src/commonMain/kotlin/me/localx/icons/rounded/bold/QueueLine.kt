package me.localx.icons.rounded.bold

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

public val Icons.Bold.QueueLine: ImageVector
    get() {
        if (_queueLine != null) {
            return _queueLine!!
        }
        _queueLine = Builder(name = "QueueLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 6.0f)
                horizontalLineToRelative(0.779f)
                curveToRelative(-0.793f, 0.952f, -1.279f, 2.167f, -1.279f, 3.5f)
                verticalLineToRelative(4.399f)
                curveToRelative(-1.161f, -0.116f, -2.163f, -0.32f, -3.0f, -0.552f)
                verticalLineToRelative(-3.848f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(5.0f, 12.641f)
                verticalLineToRelative(-3.141f)
                curveToRelative(0.0f, -1.333f, 0.486f, -2.548f, 1.279f, -3.5f)
                horizontalLineToRelative(-0.779f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.273f)
                curveToRelative(0.886f, 0.628f, 1.99f, 1.347f, 1.99f, 1.347f)
                curveToRelative(0.01f, 0.006f, 0.359f, 0.23f, 1.01f, 0.52f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(1.111f, 0.0f, 2.108f, -0.091f, 3.0f, -0.228f)
                verticalLineToRelative(-3.772f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.641f)
                curveToRelative(0.651f, -0.29f, 1.0f, -0.514f, 1.01f, -0.52f)
                curveToRelative(0.0f, 0.0f, 1.104f, -0.719f, 1.99f, -1.347f)
                verticalLineToRelative(-0.773f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.0f, 19.689f)
                verticalLineToRelative(2.811f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.974f)
                curveToRelative(-0.713f, -0.137f, -1.392f, -0.287f, -2.0f, -0.458f)
                lineToRelative(-1.0f, -0.379f)
                close()
                moveTo(14.0f, 20.928f)
                verticalLineToRelative(1.572f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.966f)
                lineToRelative(-1.0f, 0.534f)
                curveToRelative(-1.392f, 0.393f, -3.064f, 0.721f, -5.0f, 0.86f)
                close()
                moveTo(9.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-1.076f, 0.0f, -2.061f, -0.074f, -3.0f, -0.178f)
                verticalLineToRelative(1.678f)
                close()
                moveTo(17.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(0.403f, 0.0f, 0.778f, -0.104f, 1.115f, -0.273f)
                curveToRelative(-0.381f, -0.659f, -0.615f, -1.412f, -0.615f, -2.227f)
                reflectiveCurveToRelative(0.234f, -1.568f, 0.614f, -2.227f)
                curveToRelative(-0.337f, -0.169f, -0.711f, -0.273f, -1.114f, -0.273f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(0.403f, 0.0f, 0.778f, -0.104f, 1.115f, -0.273f)
                curveToRelative(-0.381f, -0.659f, -0.615f, -1.412f, -0.615f, -2.227f)
                reflectiveCurveToRelative(0.234f, -1.568f, 0.614f, -2.227f)
                curveToRelative(-0.337f, -0.169f, -0.711f, -0.273f, -1.114f, -0.273f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(22.934f, 14.39f)
                curveToRelative(-0.664f, -0.428f, -1.49f, -0.488f, -2.211f, -0.162f)
                curveToRelative(-1.457f, 0.662f, -4.528f, 1.772f, -8.723f, 1.772f)
                reflectiveCurveToRelative(-7.266f, -1.11f, -8.724f, -1.772f)
                curveToRelative(-0.72f, -0.326f, -1.547f, -0.265f, -2.21f, 0.163f)
                curveToRelative(-0.668f, 0.43f, -1.066f, 1.162f, -1.066f, 1.958f)
                verticalLineToRelative(6.152f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-5.135f)
                curveToRelative(1.895f, 0.739f, 5.015f, 1.635f, 9.0f, 1.635f)
                reflectiveCurveToRelative(7.105f, -0.896f, 9.0f, -1.635f)
                verticalLineToRelative(5.135f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-6.152f)
                curveToRelative(0.0f, -0.795f, -0.398f, -1.527f, -1.066f, -1.958f)
                close()
            }
        }
        .build()
        return _queueLine!!
    }

private var _queueLine: ImageVector? = null
