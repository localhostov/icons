package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.4094f, 19.5872f)
                    curveTo(8.8214f, 21.2339f, 6.2352f, 21.3858f, 4.4653f, 19.9362f)
                    curveTo(3.4113f, 19.0236f, 2.8728f, 17.6514f, 3.025f, 16.2655f)
                    curveTo(3.1568f, 15.2438f, 3.6344f, 14.2978f, 4.3783f, 13.5851f)
                    lineTo(7.2548f, 10.7065f)
                    curveTo(7.8405f, 10.1207f, 7.8405f, 9.171f, 7.2548f, 8.5851f)
                    curveTo(6.669f, 7.9995f, 5.7193f, 7.9995f, 5.1334f, 8.5851f)
                    lineTo(2.3179f, 11.4017f)
                    curveTo(1.0345f, 12.6393f, 0.2252f, 14.2873f, 0.0305f, 16.0595f)
                    curveTo(-0.3332f, 20.0511f, 2.6078f, 23.5818f, 6.5993f, 23.9454f)
                    curveTo(8.7429f, 24.1407f, 10.8626f, 23.3744f, 12.3857f, 21.8536f)
                    lineTo(15.3943f, 18.846f)
                    curveTo(15.98f, 18.2602f, 15.98f, 17.3105f, 15.3943f, 16.7246f)
                    curveTo(14.8085f, 16.139f, 13.8588f, 16.139f, 13.2729f, 16.7246f)
                    lineTo(10.4094f, 19.5872f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.1615f, 1.4673f)
                    curveTo(18.1747f, -0.7271f, 14.0271f, -0.3831f, 11.4427f, 2.2735f)
                    lineTo(8.6111f, 5.106f)
                    curveTo(8.0255f, 5.6919f, 8.0255f, 6.6416f, 8.6111f, 7.2274f)
                    curveTo(9.197f, 7.8131f, 10.1467f, 7.8131f, 10.7325f, 7.2274f)
                    lineTo(13.6091f, 4.3539f)
                    curveTo(15.1624f, 2.7473f, 17.6757f, 2.5663f, 19.4432f, 3.9338f)
                    curveTo(21.2624f, 5.4255f, 21.5279f, 8.1096f, 20.0361f, 9.9288f)
                    curveTo(19.9488f, 10.0353f, 19.8564f, 10.1375f, 19.7592f, 10.235f)
                    lineTo(16.7506f, 13.2435f)
                    curveTo(16.165f, 13.8294f, 16.165f, 14.7791f, 16.7506f, 15.3649f)
                    curveTo(17.3365f, 15.9506f, 18.2862f, 15.9506f, 18.872f, 15.3649f)
                    lineTo(21.8806f, 12.3564f)
                    curveTo(24.713f, 9.5149f, 24.7057f, 4.9154f, 21.8642f, 2.083f)
                    curveTo(21.6435f, 1.8629f, 21.4087f, 1.6573f, 21.1615f, 1.4673f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6111f, 13.2459f)
                    lineTo(13.2725f, 8.5844f)
                    curveTo(13.8584f, 7.9985f, 14.8083f, 7.9985f, 15.3942f, 8.5844f)
                    curveTo(15.9801f, 9.1704f, 15.9801f, 10.1203f, 15.3942f, 10.7062f)
                    lineTo(10.7328f, 15.3676f)
                    curveTo(10.1469f, 15.9535f, 9.197f, 15.9535f, 8.6111f, 15.3676f)
                    curveTo(8.0252f, 14.7817f, 8.0252f, 13.8318f, 8.6111f, 13.2459f)
                    close()
                }
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
