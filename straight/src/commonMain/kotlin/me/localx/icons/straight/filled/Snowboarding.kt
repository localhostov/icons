package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.194f, 20.865f)
                arcToRelative(1.985f, 1.985f, 0.0f, false, true, -1.139f, 1.021f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, -1.559f, -0.1f)
                lineToRelative(-2.5f, -1.1f)
                verticalLineTo(14.544f)
                lineToRelative(-3.063f, -2.662f)
                curveToRelative(0.026f, -0.029f, 2.237f, -3.04f, 2.237f, -3.04f)
                lineToRelative(6.289f, 4.0f)
                lineToRelative(1.074f, -1.688f)
                lineTo(12.291f, 4.0f)
                horizontalLineTo(8.414f)
                lineTo(5.707f, 1.293f)
                lineTo(4.293f, 2.707f)
                lineTo(7.586f, 6.0f)
                horizontalLineToRelative(3.227f)
                lineTo(8.621f, 8.852f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 8.0f, 10.68f)
                verticalLineToRelative(2.7f)
                lineTo(4.459f, 15.171f)
                lineToRelative(-1.3f, -0.572f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.973f, -2.655f)
                lineTo(0.371f, 11.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.966f, 5.318f)
                lineToRelative(16.324f, 7.185f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 21.729f)
                close()
                moveTo(15.0f, 19.81f)
                lineToRelative(-8.182f, -3.6f)
                lineTo(10.0f, 14.618f)
                verticalLineTo(11.107f)
                lineToRelative(5.0f, 4.349f)
                close()
                moveTo(17.616f, -0.019f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.616f, -0.019f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
