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

public val Icons.Outline.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcToRelative(11.944f, 11.944f, 0.0f, false, false, -2.845f, -7.741f)
                lineToRelative(0.86f, -0.86f)
                lineTo(20.6f, 1.985f)
                lineToRelative(-0.86f, 0.86f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, -15.482f, 0.0f)
                lineToRelative(-0.86f, -0.86f)
                lineTo(1.985f, 3.4f)
                lineToRelative(0.86f, 0.86f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 0.0f, 15.482f)
                lineToRelative(-0.86f, 0.86f)
                lineTo(3.4f, 22.015f)
                lineToRelative(0.86f, -0.86f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 15.482f, 0.0f)
                lineToRelative(0.86f, 0.86f)
                lineTo(22.015f, 20.6f)
                lineToRelative(-0.86f, -0.86f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, -2.262f, 6.324f)
                lineToRelative(-3.571f, -3.571f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 0.0f, -5.506f)
                lineToRelative(3.571f, -3.571f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, 6.324f, 2.262f)
                lineTo(14.753f, 7.833f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, -5.506f, 0.0f)
                lineTo(5.676f, 4.262f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 4.262f, 5.676f)
                lineTo(7.833f, 9.247f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 0.0f, 5.506f)
                lineTo(4.262f, 18.324f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(9.949f, 9.949f, 0.0f, false, true, -6.324f, -2.262f)
                lineToRelative(3.571f, -3.571f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 5.506f, 0.0f)
                lineToRelative(3.571f, 3.571f)
                arcTo(9.949f, 9.949f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
