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

public val Icons.Bold.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.008f, 17.286f)
                curveToRelative(0.582f, 0.582f, 0.686f, 1.538f, 0.15f, 2.162f)
                curveToRelative(-0.62f, 0.723f, -1.732f, 0.723f, -2.351f, 0.0f)
                curveToRelative(-0.536f, -0.625f, -0.432f, -1.58f, 0.15f, -2.162f)
                lineToRelative(0.682f, -0.682f)
                curveToRelative(0.19f, -0.19f, 0.497f, -0.19f, 0.687f, 0.0f)
                lineToRelative(0.682f, 0.682f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.652f, 0.419f, -1.202f, 1.0f, -1.408f)
                lineTo(1.0f, 4.0f)
                lineTo(0.052f, 2.114f)
                curveTo(-0.217f, 1.04f, 0.595f, 0.0f, 1.702f, 0.0f)
                horizontalLineToRelative(20.595f)
                curveToRelative(1.107f, 0.0f, 1.919f, 1.04f, 1.651f, 2.114f)
                lineToRelative(-0.948f, 1.886f)
                verticalLineToRelative(17.092f)
                curveToRelative(0.581f, 0.207f, 1.0f, 0.756f, 1.0f, 1.408f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.6f)
                curveToRelative(0.0f, -1.66f, 1.017f, -3.157f, 2.572f, -3.74f)
                curveToRelative(0.972f, -0.364f, 2.154f, -0.66f, 3.428f, -0.66f)
                reflectiveCurveToRelative(2.456f, 0.296f, 3.428f, 0.66f)
                curveToRelative(1.555f, 0.583f, 2.572f, 2.08f, 2.572f, 3.74f)
                verticalLineToRelative(8.6f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(12.22f, 21.0f)
                curveToRelative(2.108f, -0.124f, 3.779f, -1.872f, 3.779f, -4.01f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -2.112f, -2.342f, -3.914f, -3.708f, -5.133f)
                curveToRelative(-0.22f, -0.196f, -0.569f, -0.146f, -0.719f, 0.108f)
                curveToRelative(-0.846f, 1.431f, -0.652f, 3.481f, -1.41f, 3.481f)
                curveToRelative(-0.359f, 0.0f, -0.303f, -0.62f, -0.472f, -1.004f)
                curveToRelative(-0.12f, -0.271f, -0.484f, -0.313f, -0.671f, -0.082f)
                curveToRelative(-0.716f, 0.884f, -1.404f, 2.443f, -0.77f, 3.965f)
                curveToRelative(0.678f, 1.629f, 2.209f, 2.779f, 3.971f, 2.676f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
