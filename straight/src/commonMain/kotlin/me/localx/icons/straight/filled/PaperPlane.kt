package me.localx.icons.straight.filled

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

public val Icons.Filled.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.5211f, 19.8996f)
                    horizontalLineTo(10.8431f)
                    lineTo(14.3621f, 23.4146f)
                    curveTo(14.5512f, 23.6048f, 14.776f, 23.7557f, 15.0237f, 23.8586f)
                    curveTo(15.2713f, 23.9616f, 15.5369f, 24.0146f, 15.8051f, 24.0146f)
                    curveTo(15.9815f, 24.0143f, 16.1572f, 23.9918f, 16.3281f, 23.9476f)
                    curveTo(16.6733f, 23.8605f, 16.9895f, 23.6839f, 17.2447f, 23.4356f)
                    curveTo(17.5f, 23.1874f, 17.6853f, 22.8763f, 17.7821f, 22.5336f)
                    lineTo(23.9891f, 1.4246f)
                    lineTo(5.5211f, 19.8996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0869f, 18.5001f)
                    lineTo(22.5719f, 0.0121f)
                    lineTo(1.4779f, 6.2332f)
                    curveTo(1.1344f, 6.3308f, 0.8225f, 6.5166f, 0.573f, 6.7721f)
                    curveTo(0.3235f, 7.0275f, 0.1451f, 7.3438f, 0.0556f, 7.6894f)
                    curveTo(-0.034f, 8.0351f, -0.0316f, 8.3982f, 0.0625f, 8.7427f)
                    curveTo(0.1566f, 9.0871f, 0.3391f, 9.401f, 0.5919f, 9.6531f)
                    lineTo(4.0869f, 13.1451f)
                    verticalLineTo(18.5001f)
                    close()
                }
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
