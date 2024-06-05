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

public val Icons.Outline.WaterBottle: ImageVector
    get() {
        if (_waterBottle != null) {
            return _waterBottle!!
        }
        _waterBottle = Builder(name = "WaterBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                arcToRelative(2.988f, 2.988f, 0.0f, false, false, -1.886f, -2.786f)
                lineTo(15.0f, 2.969f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(0.969f)
                lineTo(5.885f, 4.215f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, 0.766f, 2.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 4.0f, 13.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, 0.766f, 2.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 4.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 19.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -0.766f, -2.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 20.0f, 15.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -0.766f, -2.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 20.0f, 9.0f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.628f, -0.928f)
                lineTo(11.0f, 4.323f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.323f)
                lineToRelative(4.371f, 1.748f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _waterBottle!!
    }

private var _waterBottle: ImageVector? = null
