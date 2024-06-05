package me.localx.icons.straight.outline

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

public val Icons.Outline.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
                moveTo(24.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.012f, 22.0f)
                lineTo(2.357f, 12.0f)
                lineTo(4.41f, 12.0f)
                lineTo(2.065f, 22.0f)
                lineTo(4.992f, 22.0f)
                lineToRelative(1.833f, -5.2f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, false, 0.98f, 0.837f)
                lineToRelative(0.665f, 0.42f)
                lineTo(7.127f, 22.0f)
                lineTo(12.99f, 22.0f)
                lineTo(12.99f, 18.551f)
                lineToRelative(-4.116f, -2.6f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.7f, 12.273f)
                lineTo(9.454f, 8.0f)
                lineTo(6.539f, 8.0f)
                lineTo(5.22f, 10.0f)
                horizontalLineToRelative(-2.4f)
                lineTo(5.487f, 6.0f)
                lineTo(13.86f, 6.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 2.57f, 1.453f)
                lineTo(18.565f, 11.0f)
                horizontalLineToRelative(1.984f)
                lineToRelative(0.473f, -2.209f)
                lineToRelative(1.956f, 0.418f)
                lineTo(20.242f, 21.975f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                close()
                moveTo(14.99f, 17.449f)
                lineTo(14.99f, 22.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(1.929f, -9.0f)
                lineTo(17.435f, 13.0f)
                lineTo(15.158f, 9.217f)
                lineToRelative(-1.952f, 4.737f)
                lineTo(11.49f, 12.869f)
                lineTo(13.5f, 8.0f)
                horizontalLineToRelative(-1.88f)
                lineTo(9.552f, 13.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.39f, 1.225f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
