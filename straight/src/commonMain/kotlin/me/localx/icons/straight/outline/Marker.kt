package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9579f, 24.0078f)
                    lineTo(11.2608f, 23.4103f)
                    curveTo(10.2998f, 22.6056f, 1.9089f, 15.3589f, 1.9089f, 10.058f)
                    curveTo(1.9089f, 4.5081f, 6.408f, 0.009f, 11.9579f, 0.009f)
                    curveTo(17.5078f, 0.009f, 22.0069f, 4.5081f, 22.0069f, 10.058f)
                    curveTo(22.0069f, 15.3589f, 13.616f, 22.6056f, 12.659f, 23.4142f)
                    lineTo(11.9579f, 24.0078f)
                    close()
                    moveTo(11.9579f, 2.1819f)
                    curveTo(7.6101f, 2.1869f, 4.0868f, 5.7102f, 4.0818f, 10.058f)
                    curveTo(4.0818f, 13.3881f, 9.2443f, 18.7078f, 11.9579f, 21.1427f)
                    curveTo(14.6716f, 18.7069f, 19.834f, 13.3841f, 19.834f, 10.058f)
                    curveTo(19.8291f, 5.7102f, 16.3057f, 2.1869f, 11.9579f, 2.1819f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.958f, 14.041f)
                    curveTo(9.7581f, 14.041f, 7.9747f, 12.2576f, 7.9747f, 10.0577f)
                    curveTo(7.9747f, 7.8577f, 9.7581f, 6.0743f, 11.958f, 6.0743f)
                    curveTo(14.158f, 6.0743f, 15.9414f, 7.8577f, 15.9414f, 10.0577f)
                    curveTo(15.9414f, 12.2576f, 14.158f, 14.041f, 11.958f, 14.041f)
                    close()
                    moveTo(11.958f, 8.066f)
                    curveTo(10.858f, 8.066f, 9.9663f, 8.9577f, 9.9663f, 10.0576f)
                    curveTo(9.9663f, 11.1576f, 10.858f, 12.0493f, 11.958f, 12.0493f)
                    curveTo(13.058f, 12.0493f, 13.9497f, 11.1576f, 13.9497f, 10.0576f)
                    curveTo(13.9497f, 8.9577f, 13.058f, 8.066f, 11.958f, 8.066f)
                    close()
                }
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
