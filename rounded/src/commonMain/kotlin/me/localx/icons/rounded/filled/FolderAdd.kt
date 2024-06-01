package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.FolderAdd: ImageVector
    get() {
        if (_folderAdd != null) {
            return _folderAdd!!
        }
        _folderAdd = Builder(name = "FolderAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.863f, 6.8802f)
                    lineTo(0.0f, 6.9912f)
                    verticalLineTo(6.0002f)
                    curveTo(0.0016f, 4.6747f, 0.5289f, 3.4038f, 1.4662f, 2.4665f)
                    curveTo(2.4036f, 1.5291f, 3.6744f, 1.0018f, 5.0f, 1.0002f)
                    horizontalLineTo(7.528f)
                    curveTo(7.9934f, 1.0006f, 8.4524f, 1.1088f, 8.869f, 1.3162f)
                    lineTo(12.025f, 2.9002f)
                    curveTo(12.1645f, 2.9671f, 12.3173f, 3.0013f, 12.472f, 3.0002f)
                    horizontalLineTo(19.0f)
                    curveTo(20.1297f, 3.0025f, 21.2254f, 3.3872f, 22.1084f, 4.0918f)
                    curveTo(22.9915f, 4.7964f, 23.6099f, 5.7792f, 23.863f, 6.8802f)
                    close()
                    moveTo(24.0f, 8.8802f)
                    verticalLineTo(18.0002f)
                    curveTo(23.9984f, 19.3258f, 23.4711f, 20.5967f, 22.5338f, 21.534f)
                    curveTo(21.5964f, 22.4714f, 20.3256f, 22.9987f, 19.0f, 23.0002f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 22.9987f, 2.4036f, 22.4714f, 1.4662f, 21.534f)
                    curveTo(0.5289f, 20.5967f, 0.0016f, 19.3258f, 0.0f, 18.0002f)
                    lineTo(0.0f, 8.9912f)
                    lineTo(24.0f, 8.8802f)
                    close()
                    moveTo(16.0f, 16.0002f)
                    curveTo(16.0f, 15.735f, 15.8946f, 15.4807f, 15.7071f, 15.2931f)
                    curveTo(15.5196f, 15.1056f, 15.2652f, 15.0002f, 15.0f, 15.0002f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(13.0002f)
                    curveTo(13.0f, 12.735f, 12.8946f, 12.4807f, 12.7071f, 12.2931f)
                    curveTo(12.5196f, 12.1056f, 12.2652f, 12.0002f, 12.0f, 12.0002f)
                    curveTo(11.7348f, 12.0002f, 11.4804f, 12.1056f, 11.2929f, 12.2931f)
                    curveTo(11.1054f, 12.4807f, 11.0f, 12.735f, 11.0f, 13.0002f)
                    verticalLineTo(15.0002f)
                    horizontalLineTo(9.0f)
                    curveTo(8.7348f, 15.0002f, 8.4804f, 15.1056f, 8.2929f, 15.2931f)
                    curveTo(8.1054f, 15.4807f, 8.0f, 15.735f, 8.0f, 16.0002f)
                    curveTo(8.0f, 16.2655f, 8.1054f, 16.5198f, 8.2929f, 16.7074f)
                    curveTo(8.4804f, 16.8949f, 8.7348f, 17.0002f, 9.0f, 17.0002f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.0002f)
                    curveTo(11.0f, 19.2655f, 11.1054f, 19.5198f, 11.2929f, 19.7074f)
                    curveTo(11.4804f, 19.8949f, 11.7348f, 20.0002f, 12.0f, 20.0002f)
                    curveTo(12.2652f, 20.0002f, 12.5196f, 19.8949f, 12.7071f, 19.7074f)
                    curveTo(12.8946f, 19.5198f, 13.0f, 19.2655f, 13.0f, 19.0002f)
                    verticalLineTo(17.0002f)
                    horizontalLineTo(15.0f)
                    curveTo(15.2652f, 17.0002f, 15.5196f, 16.8949f, 15.7071f, 16.7074f)
                    curveTo(15.8946f, 16.5198f, 16.0f, 16.2655f, 16.0f, 16.0002f)
                    close()
                }
            }
        }
        .build()
        return _folderAdd!!
    }

private var _folderAdd: ImageVector? = null
