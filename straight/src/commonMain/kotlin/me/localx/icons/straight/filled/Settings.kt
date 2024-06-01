package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9999f, 12.0f)
                    curveTo(20.9997f, 11.4483f, 20.9495f, 10.8977f, 20.8499f, 10.355f)
                    lineTo(23.8929f, 8.6f)
                    lineTo(20.8929f, 3.4f)
                    lineTo(17.8489f, 5.159f)
                    curveTo(17.0085f, 4.4399f, 16.0427f, 3.8819f, 14.9999f, 3.513f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(8.9999f)
                    verticalLineTo(3.513f)
                    curveTo(7.9572f, 3.8819f, 6.9914f, 4.4399f, 6.1509f, 5.159f)
                    lineTo(3.1069f, 3.4f)
                    lineTo(0.1069f, 8.6f)
                    lineTo(3.1499f, 10.355f)
                    curveTo(2.95f, 11.4426f, 2.95f, 12.5574f, 3.1499f, 13.645f)
                    lineTo(0.1069f, 15.4f)
                    lineTo(3.1069f, 20.6f)
                    lineTo(6.1509f, 18.842f)
                    curveTo(6.9915f, 19.5607f, 7.9573f, 20.1184f, 8.9999f, 20.487f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(14.9999f)
                    verticalLineTo(20.487f)
                    curveTo(16.0427f, 20.1181f, 17.0085f, 19.5601f, 17.8489f, 18.841f)
                    lineTo(20.8929f, 20.6f)
                    lineTo(23.8929f, 15.4f)
                    lineTo(20.8499f, 13.645f)
                    curveTo(20.9495f, 13.1023f, 20.9997f, 12.5517f, 20.9999f, 12.0f)
                    close()
                    moveTo(14.9999f, 12.0f)
                    curveTo(14.9999f, 12.5933f, 14.824f, 13.1734f, 14.4943f, 13.6667f)
                    curveTo(14.1647f, 14.1601f, 13.6962f, 14.5446f, 13.148f, 14.7716f)
                    curveTo(12.5998f, 14.9987f, 11.9966f, 15.0581f, 11.4147f, 14.9424f)
                    curveTo(10.8327f, 14.8266f, 10.2982f, 14.5409f, 9.8786f, 14.1213f)
                    curveTo(9.4591f, 13.7018f, 9.1733f, 13.1672f, 9.0576f, 12.5853f)
                    curveTo(8.9418f, 12.0033f, 9.0012f, 11.4001f, 9.2283f, 10.8519f)
                    curveTo(9.4554f, 10.3038f, 9.8399f, 9.8352f, 10.3332f, 9.5056f)
                    curveTo(10.8266f, 9.176f, 11.4066f, 9.0f, 11.9999f, 9.0f)
                    curveTo(12.7956f, 9.0f, 13.5586f, 9.3161f, 14.1213f, 9.8787f)
                    curveTo(14.6839f, 10.4413f, 14.9999f, 11.2044f, 14.9999f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
