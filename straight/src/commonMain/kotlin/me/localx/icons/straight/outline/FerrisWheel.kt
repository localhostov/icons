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

public val Icons.Outline.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = Builder(name = "FerrisWheel", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.159f, 8.016f)
                arcToRelative(9.918f, 9.918f, 0.0f, false, false, -5.175f, -5.175f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.016f, 2.841f)
                arcTo(9.921f, 9.921f, 0.0f, false, false, 2.841f, 8.016f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.2f, 14.0f)
                arcTo(9.967f, 9.967f, 0.0f, false, false, 7.85f, 21.093f)
                lineTo(6.861f, 24.0f)
                lineTo(8.974f, 24.0f)
                lineToRelative(0.77f, -2.265f)
                arcToRelative(9.718f, 9.718f, 0.0f, false, false, 4.512f, 0.0f)
                lineTo(15.027f, 24.0f)
                horizontalLineToRelative(2.112f)
                lineToRelative(-0.989f, -2.907f)
                arcTo(9.971f, 9.971f, 0.0f, false, false, 21.8f, 14.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.159f, 8.016f)
                close()
                moveTo(10.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(14.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(2.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(5.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.057f, 8.057f, 0.0f, false, true, -1.609f, -0.166f)
                lineTo(12.0f, 15.1f)
                lineToRelative(1.609f, 4.73f)
                arcTo(8.057f, 8.057f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(15.5f, 19.194f)
                lineTo(12.944f, 11.678f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.894f, 0.0f)
                lineTo(8.5f, 19.194f)
                arcTo(7.971f, 7.971f, 0.0f, false, true, 4.26f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.081f, 8.008f)
                arcTo(8.114f, 8.114f, 0.0f, false, true, 8.0f, 5.085f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 5.085f)
                arcToRelative(8.111f, 8.111f, 0.0f, false, true, 2.918f, 2.923f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.74f)
                arcTo(7.976f, 7.976f, 0.0f, false, true, 15.5f, 19.194f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
