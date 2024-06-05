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

public val Icons.Bold.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 0.0f)
                arcTo(2.448f, 2.448f, 0.0f, false, false, 12.0f, 2.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.629f)
                lineTo(5.093f, 6.849f)
                curveTo(4.137f, 5.262f, 0.333f, 3.78f, 0.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 8.0f)
                arcToRelative(1.419f, 1.419f, 0.0f, false, true, 1.151f, 0.592f)
                lineTo(4.0f, 10.481f)
                verticalLineTo(11.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 9.5f, 17.0f)
                horizontalLineToRelative(1.109f)
                lineTo(8.777f, 19.016f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.186f, 2.055f)
                lineTo(14.0f, 17.73f)
                lineToRelative(3.037f, 3.341f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.186f, -2.055f)
                lineTo(17.391f, 17.0f)
                horizontalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 11.5f)
                verticalLineToRelative(-1.0f)
                curveTo(24.0f, 2.194f, 17.786f, 0.0f, 14.5f, 0.0f)
                close()
                moveTo(15.0f, 3.032f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 20.907f, 9.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(18.5f, 14.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                horizontalLineToRelative(13.9f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 14.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
