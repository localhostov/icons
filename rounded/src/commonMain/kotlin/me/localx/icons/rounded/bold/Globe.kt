package me.localx.icons.rounded.bold

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

public val Icons.Bold.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(20.941f, 11.0f)
                    horizontalLineTo(17.463f)
                    curveTo(17.2362f, 8.3949f, 16.4558f, 5.8682f, 15.174f, 3.589f)
                    curveTo(16.7235f, 4.175f, 18.0815f, 5.1767f, 19.0989f, 6.4841f)
                    curveTo(20.1163f, 7.7915f, 20.7537f, 9.354f, 20.941f, 11.0f)
                    close()
                    moveTo(9.685f, 14.0f)
                    horizontalLineTo(14.315f)
                    curveTo(13.9213f, 16.0948f, 13.1359f, 18.0964f, 12.0f, 19.9f)
                    curveTo(10.864f, 18.0965f, 10.0786f, 16.0948f, 9.685f, 14.0f)
                    close()
                    moveTo(9.553f, 11.0f)
                    curveTo(9.8331f, 8.5438f, 10.67f, 6.1839f, 12.0f, 4.1f)
                    curveTo(13.3302f, 6.1838f, 14.1671f, 8.5437f, 14.447f, 11.0f)
                    horizontalLineTo(9.553f)
                    close()
                    moveTo(8.826f, 3.589f)
                    curveTo(7.5442f, 5.8682f, 6.7638f, 8.3949f, 6.537f, 11.0f)
                    horizontalLineTo(3.059f)
                    curveTo(3.2464f, 9.354f, 3.8837f, 7.7915f, 4.9011f, 6.4841f)
                    curveTo(5.9185f, 5.1767f, 7.2765f, 4.175f, 8.826f, 3.589f)
                    close()
                    moveTo(3.232f, 14.0f)
                    horizontalLineTo(6.641f)
                    curveTo(6.9775f, 16.2511f, 7.7177f, 18.423f, 8.826f, 20.411f)
                    curveTo(7.4381f, 19.885f, 6.2015f, 19.0248f, 5.2257f, 17.9064f)
                    curveTo(4.2499f, 16.7881f, 3.5651f, 15.4463f, 3.232f, 14.0f)
                    close()
                    moveTo(15.174f, 20.411f)
                    curveTo(16.2828f, 18.4231f, 17.023f, 16.2512f, 17.359f, 14.0f)
                    horizontalLineTo(20.768f)
                    curveTo(20.4349f, 15.4463f, 19.7501f, 16.7881f, 18.7743f, 17.9064f)
                    curveTo(17.7985f, 19.0248f, 16.5619f, 19.885f, 15.174f, 20.411f)
                    close()
                }
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
