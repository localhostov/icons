package me.localx.icons.straight.bold

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

public val Icons.Bold.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0328f, 19.011f)
                    curveTo(12.4925f, 19.0118f, 12.9477f, 18.9217f, 13.3725f, 18.746f)
                    curveTo(13.7972f, 18.5702f, 14.183f, 18.3123f, 14.5078f, 17.987f)
                    lineTo(18.4268f, 14.068f)
                    lineTo(16.3058f, 11.947f)
                    lineTo(13.5238f, 14.729f)
                    lineTo(13.4998f, 0.0f)
                    horizontalLineTo(10.4998f)
                    lineTo(10.5238f, 14.709f)
                    lineTo(7.7598f, 11.947f)
                    lineTo(5.6388f, 14.068f)
                    lineTo(9.5578f, 17.987f)
                    curveTo(9.8825f, 18.3124f, 10.2683f, 18.5704f, 10.6931f, 18.7461f)
                    curveTo(11.1178f, 18.9219f, 11.5731f, 19.0119f, 12.0328f, 19.011f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 15.9999f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9999f)
                    curveTo(0.0f, 21.7955f, 0.3161f, 22.5586f, 0.8787f, 23.1212f)
                    curveTo(1.4413f, 23.6838f, 2.2043f, 23.9999f, 3.0f, 23.9999f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9999f, 22.5587f, 23.6838f, 23.1213f, 23.1212f)
                    curveTo(23.6839f, 22.5586f, 24.0f, 21.7955f, 24.0f, 20.9999f)
                    verticalLineTo(15.9999f)
                    horizontalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
