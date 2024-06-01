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

public val Icons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0072f, 18.6245f, 5.3755f, 23.9928f, 12.0f, 24.0f)
                    close()
                    moveTo(7.05f, 7.05f)
                    curveTo(9.7858f, 4.3209f, 14.2142f, 4.3209f, 16.95f, 7.05f)
                    curveTo(17.3337f, 7.4473f, 17.3227f, 8.0803f, 16.9254f, 8.464f)
                    curveTo(16.5379f, 8.8383f, 15.9235f, 8.8383f, 15.536f, 8.464f)
                    curveTo(13.5832f, 6.5116f, 10.4173f, 6.512f, 8.465f, 8.4649f)
                    curveTo(6.5126f, 10.4178f, 6.513f, 13.5836f, 8.4659f, 15.536f)
                    curveTo(10.4184f, 17.488f, 13.5835f, 17.488f, 15.5361f, 15.536f)
                    curveTo(15.9333f, 15.1523f, 16.5664f, 15.1633f, 16.95f, 15.5606f)
                    curveTo(17.3243f, 15.9481f, 17.3243f, 16.5624f, 16.95f, 16.95f)
                    curveTo(14.2163f, 19.6838f, 9.7838f, 19.6838f, 7.05f, 16.95f)
                    curveTo(4.3162f, 14.2162f, 4.3162f, 9.7838f, 7.05f, 7.05f)
                    close()
                }
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
