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

public val Icons.Filled.LayerMinus: ImageVector
    get() {
        if (_layerMinus != null) {
            return _layerMinus!!
        }
        _layerMinus = Builder(name = "LayerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.23f)
                curveToRelative(0.0f, -0.352f, 0.184f, -0.677f, 0.485f, -0.857f)
                lineTo(10.347f, 0.456f)
                curveToRelative(1.021f, -0.613f, 2.287f, -0.613f, 3.307f, 0.0f)
                lineToRelative(9.861f, 5.917f)
                curveToRelative(0.301f, 0.181f, 0.485f, 0.506f, 0.485f, 0.857f)
                reflectiveCurveToRelative(-0.184f, 0.677f, -0.485f, 0.857f)
                lineToRelative(-9.861f, 5.917f)
                curveToRelative(-0.51f, 0.306f, -1.082f, 0.458f, -1.653f, 0.459f)
                curveToRelative(-0.572f, 0.0f, -1.143f, -0.153f, -1.653f, -0.459f)
                lineTo(0.485f, 8.088f)
                curveToRelative(-0.301f, -0.181f, -0.485f, -0.506f, -0.485f, -0.857f)
                close()
                moveTo(23.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.515f, 21.914f)
                lineTo(1.515f, 15.314f)
                curveToRelative(-0.475f, -0.285f, -1.088f, -0.131f, -1.372f, 0.343f)
                curveToRelative(-0.284f, 0.474f, -0.131f, 1.088f, 0.343f, 1.372f)
                lineToRelative(11.0f, 6.6f)
                curveToRelative(0.161f, 0.097f, 0.338f, 0.143f, 0.514f, 0.143f)
                curveToRelative(0.34f, 0.0f, 0.671f, -0.173f, 0.858f, -0.485f)
                curveToRelative(0.284f, -0.474f, 0.131f, -1.088f, -0.343f, -1.372f)
                close()
                moveTo(22.486f, 10.747f)
                lineToRelative(-10.485f, 6.291f)
                lineTo(1.515f, 10.747f)
                curveToRelative(-0.475f, -0.285f, -1.088f, -0.132f, -1.372f, 0.343f)
                curveToRelative(-0.284f, 0.474f, -0.131f, 1.088f, 0.343f, 1.372f)
                lineToRelative(11.0f, 6.6f)
                curveToRelative(0.159f, 0.095f, 0.336f, 0.143f, 0.515f, 0.143f)
                reflectiveCurveToRelative(0.356f, -0.048f, 0.515f, -0.143f)
                lineToRelative(11.0f, -6.6f)
                curveToRelative(0.474f, -0.284f, 0.627f, -0.898f, 0.343f, -1.372f)
                reflectiveCurveToRelative(-0.898f, -0.627f, -1.372f, -0.343f)
                close()
            }
        }
        .build()
        return _layerMinus!!
    }

private var _layerMinus: ImageVector? = null
