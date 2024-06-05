package me.localx.icons.rounded.bold

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

public val Icons.Bold.HouseFlood: ImageVector
    get() {
        if (_houseFlood != null) {
            return _houseFlood!!
        }
        _houseFlood = Builder(name = "HouseFlood", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.253f, 23.407f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.506f, -2.595f)
                arcToRelative(1.706f, 1.706f, 0.0f, false, true, -1.806f, -0.149f)
                arcToRelative(3.352f, 3.352f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, -2.118f, 0.0f)
                arcToRelative(3.352f, 3.352f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, -2.118f, 0.0f)
                arcToRelative(3.352f, 3.352f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.709f, 1.709f, 0.0f, false, true, -1.806f, 0.149f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.747f, 23.407f)
                arcToRelative(4.759f, 4.759f, 0.0f, false, false, 5.05f, -0.3f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.914f, 4.914f, 0.0f, false, false, 5.594f, 0.0f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.914f, 4.914f, 0.0f, false, false, 5.594f, 0.0f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.87f, 4.87f, 0.0f, false, false, 2.8f, 0.9f)
                arcTo(4.491f, 4.491f, 0.0f, false, false, 23.253f, 23.407f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.5f)
                verticalLineTo(11.167f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.352f)
                lineToRelative(7.086f, -7.086f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.536f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(7.086f, 7.086f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, 0.352f)
                verticalLineToRelative(5.325f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineTo(11.169f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, false, -1.025f, -2.475f)
                lineTo(15.889f, 1.608f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -7.778f, 0.0f)
                lineTo(1.025f, 8.694f)
                arcTo(3.473f, 3.473f, 0.0f, false, false, 0.0f, 11.169f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.182f, 14.0f)
                horizontalLineToRelative(-0.364f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 8.0f, 17.818f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.182f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 12.182f, 14.0f)
                close()
            }
        }
        .build()
        return _houseFlood!!
    }

private var _houseFlood: ImageVector? = null
