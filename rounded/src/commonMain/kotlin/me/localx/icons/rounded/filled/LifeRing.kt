package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, true, 0.833f, -2.753f)
                lineTo(2.845f, 4.259f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 0.0f, 15.482f)
                lineToRelative(4.988f, -4.988f)
                arcTo(4.969f, 4.969f, 0.0f, false, true, 7.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.155f, 4.259f)
                lineTo(16.167f, 9.247f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, true, 0.0f, 5.506f)
                lineToRelative(4.988f, 4.988f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 0.0f, -15.482f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, true, -2.753f, -0.833f)
                lineTo(4.259f, 21.155f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 15.482f, 0.0f)
                lineToRelative(-4.988f, -4.988f)
                arcTo(4.969f, 4.969f, 0.0f, false, true, 12.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, true, 2.753f, 0.833f)
                lineToRelative(4.988f, -4.988f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, -15.482f, 0.0f)
                lineTo(9.247f, 7.833f)
                arcTo(4.969f, 4.969f, 0.0f, false, true, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
