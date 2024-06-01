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

public val Icons.Bold.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0171f, 13.4997f)
                    horizontalLineTo(14.4551f)
                    lineTo(11.7661f, 16.1887f)
                    lineTo(13.8871f, 18.3107f)
                    lineTo(18.0761f, 14.1207f)
                    curveTo(18.6385f, 13.5581f, 18.9544f, 12.7951f, 18.9544f, 11.9997f)
                    curveTo(18.9544f, 11.2042f, 18.6385f, 10.4412f, 18.0761f, 9.8786f)
                    lineTo(13.8761f, 5.6786f)
                    lineTo(11.7531f, 7.7997f)
                    lineTo(14.4531f, 10.4997f)
                    horizontalLineTo(3.0171f)
                    verticalLineTo(13.4997f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.565f, 0.0074f, 1.6711f, 0.3857f, 1.0149f, 1.0517f)
                    curveTo(0.3586f, 1.7177f, -0.0064f, 2.617f, -0.0f, 3.552f)
                    verticalLineTo(7.9f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.552f)
                    curveTo(2.9965f, 3.4829f, 3.0066f, 3.4138f, 3.0299f, 3.3486f)
                    curveTo(3.0531f, 3.2835f, 3.089f, 3.2235f, 3.1354f, 3.1723f)
                    curveTo(3.1819f, 3.121f, 3.238f, 3.0794f, 3.3005f, 3.0498f)
                    curveTo(3.3631f, 3.0203f, 3.4309f, 3.0033f, 3.5f, 3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6388f, 3.0067f, 20.7693f, 3.0682f, 20.863f, 3.1709f)
                    curveTo(20.9567f, 3.2735f, 21.0059f, 3.4091f, 21.0f, 3.548f)
                    verticalLineTo(20.448f)
                    curveTo(21.0059f, 20.5869f, 20.9567f, 20.7225f, 20.863f, 20.8251f)
                    curveTo(20.7693f, 20.9278f, 20.6388f, 20.9893f, 20.5f, 20.996f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3611f, 20.9893f, 3.2306f, 20.9278f, 3.1369f, 20.8251f)
                    curveTo(3.0432f, 20.7225f, 2.994f, 20.5869f, 3.0f, 20.448f)
                    verticalLineTo(16.1f)
                    horizontalLineTo(-0.0f)
                    verticalLineTo(20.452f)
                    curveTo(-0.0054f, 21.3863f, 0.3601f, 22.2846f, 1.0163f, 22.9497f)
                    curveTo(1.6724f, 23.6149f, 2.5657f, 23.9926f, 3.5f, 24.0f)
                    horizontalLineTo(20.5f)
                    curveTo(21.435f, 23.9926f, 22.3288f, 23.6143f, 22.985f, 22.9483f)
                    curveTo(23.6413f, 22.2823f, 24.0063f, 21.383f, 24.0f, 20.448f)
                    verticalLineTo(3.552f)
                    curveTo(24.0063f, 2.617f, 23.6413f, 1.7177f, 22.985f, 1.0517f)
                    curveTo(22.3288f, 0.3857f, 21.435f, 0.0074f, 20.5f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
