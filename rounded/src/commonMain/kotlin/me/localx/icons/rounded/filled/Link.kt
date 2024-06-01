package me.localx.icons.rounded.filled

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

public val Icons.Filled.Link: ImageVector
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
                    moveTo(13.8457f, 17.2654f)
                    lineTo(10.5841f, 20.527f)
                    curveTo(8.5944f, 22.4635f, 5.4115f, 22.4204f, 3.4749f, 20.4307f)
                    curveTo(1.5757f, 18.4794f, 1.5753f, 15.3707f, 3.474f, 13.4189f)
                    lineTo(6.7356f, 10.1543f)
                    curveTo(7.126f, 9.7636f, 7.1258f, 9.1304f, 6.735f, 8.7399f)
                    curveTo(6.3443f, 8.3495f, 5.7111f, 8.3497f, 5.3207f, 8.7404f)
                    lineTo(2.0601f, 12.005f)
                    curveTo(-0.6836f, 14.7501f, -0.6825f, 19.1996f, 2.0626f, 21.9434f)
                    curveTo(4.8076f, 24.6871f, 9.2572f, 24.6859f, 12.0009f, 21.9409f)
                    lineTo(15.2625f, 18.6793f)
                    curveTo(15.6462f, 18.2821f, 15.6351f, 17.6491f, 15.238f, 17.2655f)
                    curveTo(14.8505f, 16.8912f, 14.2362f, 16.8912f, 13.8487f, 17.2655f)
                    horizontalLineTo(13.8457f)
                    verticalLineTo(17.2654f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9437f, 2.0613f)
                    curveTo(20.6294f, 0.738f, 18.8402f, -0.0041f, 16.9752f, 5.0E-4f)
                    curveTo(15.1113f, -0.0045f, 13.3227f, 0.7361f, 12.0078f, 2.0573f)
                    lineTo(8.7412f, 5.3199f)
                    curveTo(8.3505f, 5.7103f, 8.3502f, 6.3435f, 8.7407f, 6.7342f)
                    curveTo(9.1311f, 7.1249f, 9.7643f, 7.1252f, 10.155f, 6.7347f)
                    lineTo(13.4196f, 3.4731f)
                    curveTo(14.3598f, 2.5272f, 15.6395f, 1.9969f, 16.9732f, 2.0003f)
                    curveTo(19.7497f, 2.0012f, 21.9999f, 4.2528f, 21.9989f, 7.0293f)
                    curveTo(21.9985f, 8.3619f, 21.469f, 9.6399f, 20.5267f, 10.5823f)
                    lineTo(17.2651f, 13.8439f)
                    curveTo(16.8744f, 14.2346f, 16.8744f, 14.868f, 17.2651f, 15.2587f)
                    curveTo(17.6559f, 15.6494f, 18.2893f, 15.6494f, 18.68f, 15.2587f)
                    lineTo(21.9416f, 11.9991f)
                    curveTo(24.6814f, 9.2533f, 24.6823f, 4.8081f, 21.9437f, 2.0613f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.2937f, 8.2929f)
                    lineTo(8.2944f, 14.2921f)
                    curveTo(7.8972f, 14.6758f, 7.8862f, 15.3088f, 8.2698f, 15.706f)
                    curveTo(8.6535f, 16.1031f, 9.2865f, 16.1142f, 9.6836f, 15.7305f)
                    curveTo(9.692f, 15.7225f, 9.7001f, 15.7143f, 9.7082f, 15.706f)
                    lineTo(15.7075f, 9.7067f)
                    curveTo(16.0911f, 9.3095f, 16.0801f, 8.6765f, 15.6829f, 8.2929f)
                    curveTo(15.2955f, 7.9187f, 14.6812f, 7.9187f, 14.2937f, 8.2929f)
                    close()
                }
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
