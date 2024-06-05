package me.localx.icons.rounded.bold

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

public val Icons.Bold.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = Builder(name = "FerrisWheel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.813f, 7.084f)
                lineToRelative(0.0f, -0.008f)
                arcToRelative(10.169f, 10.169f, 0.0f, false, false, -4.487f, -4.188f)
                arcTo(3.992f, 3.992f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.992f, 3.992f, 0.0f, false, false, 7.677f, 2.888f)
                arcTo(10.1f, 10.1f, 0.0f, false, false, 3.2f, 7.081f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, false, -0.947f, 7.5f)
                arcTo(9.9f, 9.9f, 0.0f, false, false, 7.4f, 20.907f)
                lineToRelative(-0.337f, 1.181f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.884f, 0.824f)
                lineToRelative(0.3f, -1.061f)
                arcTo(10.467f, 10.467f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(10.342f, 10.342f, 0.0f, false, false, 1.753f, -0.151f)
                lineToRelative(0.3f, 1.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.884f, -0.824f)
                lineTo(16.6f, 20.9f)
                arcToRelative(9.935f, 9.935f, 0.0f, false, false, 5.152f, -6.324f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, false, -0.942f, -7.493f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(11.5f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(5.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -0.917f, -0.076f)
                lineTo(12.0f, 15.717f)
                lineToRelative(0.92f, 3.218f)
                arcTo(7.166f, 7.166f, 0.0f, false, true, 12.0f, 19.0f)
                close()
                moveTo(15.757f, 17.943f)
                lineTo(14.636f, 14.024f)
                arcTo(2.728f, 2.728f, 0.0f, false, false, 9.371f, 14.0f)
                lineTo(8.246f, 17.933f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, -2.683f, -2.99f)
                arcToRelative(3.982f, 3.982f, 0.0f, false, false, 1.1f, -7.573f)
                arcTo(7.113f, 7.113f, 0.0f, false, true, 8.106f, 6.091f)
                arcTo(3.988f, 3.988f, 0.0f, false, false, 11.5f, 8.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, 3.4f, -1.92f)
                arcToRelative(7.176f, 7.176f, 0.0f, false, true, 1.445f, 1.289f)
                arcToRelative(3.982f, 3.982f, 0.0f, false, false, 1.1f, 7.575f)
                arcTo(6.965f, 6.965f, 0.0f, false, true, 15.757f, 17.943f)
                close()
            }
        }
        .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
