package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Guide: ImageVector
    get() {
        if (_guide != null) {
            return _guide!!
        }
        _guide = Builder(name = "Guide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.0f)
                lineTo(1.09f, 5.0f)
                curveTo(1.569f, 2.167f, 4.033f, 0.0f, 7.0f, 0.0f)
                curveToRelative(2.215f, 0.0f, 4.149f, 1.21f, 5.188f, 3.0f)
                horizontalLineToRelative(1.812f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, -2.167f, 5.91f, -5.0f)
                lineTo(1.09f, 7.0f)
                curveToRelative(0.478f, 2.833f, 2.942f, 5.0f, 5.91f, 5.0f)
                close()
                moveTo(23.565f, 3.364f)
                lineToRelative(-3.565f, 1.885f)
                verticalLineToRelative(4.95f)
                curveToRelative(0.0f, 0.77f, -0.296f, 1.51f, -0.827f, 2.067f)
                lineToRelative(-5.726f, 6.01f)
                curveToRelative(0.355f, 0.837f, 0.553f, 1.757f, 0.553f, 2.722f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(2.0f, 23.998f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                horizontalLineToRelative(5.277f)
                curveToRelative(0.234f, 0.0f, 0.46f, -0.082f, 0.639f, -0.231f)
                lineToRelative(4.724f, -3.938f)
                curveToRelative(0.228f, -0.19f, 0.36f, -0.472f, 0.36f, -0.77f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.534f, 0.422f, -0.994f, 0.955f, -1.0f)
                curveToRelative(0.616f, -0.007f, 1.226f, 0.121f, 1.796f, 0.377f)
                lineToRelative(2.813f, 1.259f)
                curveToRelative(0.581f, 0.399f, 0.581f, 1.329f, 0.0f, 1.729f)
                close()
            }
        }
        .build()
        return _guide!!
    }

private var _guide: ImageVector? = null
