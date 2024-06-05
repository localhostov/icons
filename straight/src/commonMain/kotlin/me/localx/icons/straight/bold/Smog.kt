package me.localx.icons.straight.bold

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

public val Icons.Bold.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 19.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(14.456f, 12.769f)
                arcToRelative(5.428f, 5.428f, 0.0f, false, false, 4.8f, -0.842f)
                arcTo(3.829f, 3.829f, 0.0f, false, false, 20.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.226f, -7.994f)
                arcToRelative(5.359f, 5.359f, 0.0f, false, false, -4.8f, -1.971f)
                arcTo(6.987f, 6.987f, 0.0f, false, false, 5.6f, 2.0f)
                lineTo(5.5f, 2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                arcToRelative(5.342f, 5.342f, 0.0f, false, false, 1.185f, -0.133f)
                arcToRelative(6.981f, 6.981f, 0.0f, false, false, 7.771f, -0.1f)
                close()
                moveTo(6.416f, 9.818f)
                arcToRelative(2.506f, 2.506f, 0.0f, true, true, -0.473f, -4.77f)
                lineTo(6.82f, 5.2f)
                lineToRelative(0.556f, -0.7f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, true, 6.307f, 0.08f)
                lineToRelative(0.625f, 0.823f)
                lineToRelative(0.992f, -0.291f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, true, 2.867f, 1.172f)
                lineToRelative(0.541f, 0.964f)
                lineToRelative(1.081f, -0.231f)
                arcTo(1.019f, 1.019f, 0.0f, false, true, 20.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, true, -1.436f, 0.89f)
                lineTo(18.571f, 8.4f)
                lineToRelative(-0.759f, 0.8f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, true, -2.929f, 0.51f)
                lineToRelative(-0.925f, -0.468f)
                lineToRelative(-0.765f, 0.7f)
                arcToRelative(4.083f, 4.083f, 0.0f, false, true, -5.261f, 0.115f)
                lineTo(7.248f, 9.49f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
