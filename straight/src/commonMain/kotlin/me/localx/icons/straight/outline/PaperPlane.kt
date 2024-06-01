package me.localx.icons.straight.outline

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

public val Icons.Outline.PaperPlane: ImageVector
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
                    moveTo(1.4438f, 6.6687f)
                    curveTo(1.109f, 6.7644f, 0.8049f, 6.9459f, 0.5617f, 7.1951f)
                    curveTo(0.3185f, 7.4444f, 0.1447f, 7.7528f, 0.0573f, 8.0899f)
                    curveTo(-0.0301f, 8.427f, -0.028f, 8.7811f, 0.0635f, 9.1171f)
                    curveTo(0.155f, 9.4531f, 0.3326f, 9.7594f, 0.5788f, 10.0057f)
                    lineTo(3.9908f, 13.4137f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(10.5838f)
                    lineTo(14.0188f, 23.4297f)
                    curveTo(14.2032f, 23.6157f, 14.4225f, 23.7634f, 14.6641f, 23.8643f)
                    curveTo(14.9058f, 23.9652f, 15.165f, 24.0173f, 15.4268f, 24.0177f)
                    curveTo(15.5989f, 24.0174f, 15.7703f, 23.9952f, 15.9368f, 23.9517f)
                    curveTo(16.2738f, 23.8669f, 16.5824f, 23.6947f, 16.8317f, 23.4526f)
                    curveTo(17.081f, 23.2105f, 17.2621f, 22.9071f, 17.3568f, 22.5727f)
                    lineTo(23.9908f, 0.0208f)
                    lineTo(1.4438f, 6.6687f)
                    close()
                    moveTo(1.9998f, 8.5917f)
                    lineTo(19.0278f, 3.5717f)
                    lineTo(5.9928f, 16.5857f)
                    verticalLineTo(12.5857f)
                    lineTo(1.9998f, 8.5917f)
                    close()
                    moveTo(15.4398f, 22.0157f)
                    lineTo(11.4128f, 17.9997f)
                    horizontalLineTo(7.4128f)
                    lineTo(20.4458f, 4.9777f)
                    lineTo(15.4398f, 22.0157f)
                    close()
                }
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
