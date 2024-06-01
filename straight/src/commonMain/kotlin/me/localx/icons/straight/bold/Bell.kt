package me.localx.icons.straight.bold

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

public val Icons.Bold.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6081f, 17.0129f)
                    lineTo(20.8081f, 6.9129f)
                    curveTo(20.2454f, 4.8812f, 19.0191f, 3.0962f, 17.3244f, 1.8422f)
                    curveTo(15.6297f, 0.5882f, 13.5641f, -0.0626f, 11.4567f, -0.0066f)
                    curveTo(9.3492f, 0.0495f, 7.3211f, 0.8091f, 5.6954f, 2.1513f)
                    curveTo(4.0698f, 3.4935f, 2.94f, 5.3412f, 2.4861f, 7.3999f)
                    lineTo(0.3211f, 17.1399f)
                    curveTo(0.2399f, 17.5054f, 0.2418f, 17.8844f, 0.3268f, 18.249f)
                    curveTo(0.4117f, 18.6137f, 0.5774f, 18.9545f, 0.8117f, 19.2465f)
                    curveTo(1.046f, 19.5385f, 1.3429f, 19.7742f, 1.6805f, 19.9361f)
                    curveTo(2.0181f, 20.098f, 2.3877f, 20.182f, 2.7621f, 20.1819f)
                    horizontalLineTo(6.9051f)
                    curveTo(7.2233f, 21.2824f, 7.8905f, 22.2497f, 8.8062f, 22.9382f)
                    curveTo(9.7219f, 23.6266f, 10.8365f, 23.9988f, 11.9821f, 23.9988f)
                    curveTo(13.1277f, 23.9988f, 14.2422f, 23.6266f, 15.1579f, 22.9382f)
                    curveTo(16.0736f, 22.2497f, 16.7408f, 21.2824f, 17.0591f, 20.1819f)
                    horizontalLineTo(21.2001f)
                    curveTo(21.5855f, 20.1819f, 21.9657f, 20.0929f, 22.3109f, 19.9216f)
                    curveTo(22.6562f, 19.7504f, 22.9572f, 19.5017f, 23.1905f, 19.1948f)
                    curveTo(23.4237f, 18.888f, 23.5828f, 18.5314f, 23.6555f, 18.1529f)
                    curveTo(23.7281f, 17.7744f, 23.7122f, 17.3843f, 23.6091f, 17.0129f)
                    horizontalLineTo(23.6081f)
                    close()
                    moveTo(3.3851f, 17.1819f)
                    lineTo(5.4151f, 8.0449f)
                    curveTo(5.726f, 6.641f, 6.4976f, 5.3814f, 7.6071f, 4.4667f)
                    curveTo(8.7166f, 3.552f, 10.1002f, 3.0347f, 11.5377f, 2.9972f)
                    curveTo(12.9751f, 2.9597f, 14.3838f, 3.4042f, 15.5395f, 4.2598f)
                    curveTo(16.6952f, 5.1155f, 17.5314f, 6.3331f, 17.9151f, 7.7189f)
                    lineTo(20.5431f, 17.1819f)
                    horizontalLineTo(3.3851f)
                    close()
                }
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
