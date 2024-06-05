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

public val Icons.Filled.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.01f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(0.01f, 24.0f)
                lineTo(0.01f, 22.0f)
                lineTo(0.022f, 22.0f)
                lineTo(2.1f, 12.0f)
                lineTo(4.15f, 12.0f)
                lineTo(2.074f, 22.0f)
                lineTo(5.115f, 22.0f)
                lineToRelative(1.72f, -5.2f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 0.979f, 0.837f)
                lineToRelative(0.665f, 0.42f)
                lineTo(7.274f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 18.551f)
                lineToRelative(-4.117f, -2.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.172f, -3.674f)
                lineTo(9.464f, 8.0f)
                lineTo(6.548f, 8.0f)
                lineTo(5.229f, 10.0f)
                horizontalLineToRelative(-2.4f)
                lineTo(5.5f, 6.008f)
                lineTo(5.5f, 6.0f)
                lineTo(13.87f, 6.0f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, 2.57f, 1.453f)
                lineTo(18.575f, 11.0f)
                horizontalLineToRelative(1.947f)
                lineToRelative(0.513f, -2.225f)
                lineToRelative(1.949f, 0.45f)
                lineTo(20.273f, 21.973f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.01f, 20.0f)
                close()
                moveTo(20.06f, 13.0f)
                lineTo(17.444f, 13.0f)
                lineTo(14.615f, 8.333f)
                lineToRelative(-2.9f, 7.026f)
                lineTo(15.0f, 17.449f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(3.214f)
                close()
                moveTo(14.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 17.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 0.0f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
