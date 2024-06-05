package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

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
                moveTo(9.244f, 7.83f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, 5.512f, 0.0f)
                lineToRelative(4.988f, -4.988f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, false, -15.488f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.158f, 4.256f)
                lineTo(16.17f, 9.244f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, 0.0f, 5.512f)
                lineToRelative(4.988f, 4.988f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, false, 0.0f, -15.488f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.756f, 16.17f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, -5.512f, 0.0f)
                lineTo(4.256f, 21.158f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, false, 15.488f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.83f, 14.756f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, 0.0f, -5.512f)
                lineTo(2.842f, 4.256f)
                arcToRelative(11.972f, 11.972f, 0.0f, false, false, 0.0f, 15.488f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
