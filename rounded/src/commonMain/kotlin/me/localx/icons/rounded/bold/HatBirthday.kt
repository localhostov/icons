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

public val Icons.Bold.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.443f, 21.824f)
                arcTo(4.319f, 4.319f, 0.0f, false, false, 5.471f, 24.0f)
                lineTo(18.529f, 24.0f)
                arcToRelative(4.319f, 4.319f, 0.0f, false, false, 4.028f, -2.176f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, false, -0.473f, -4.618f)
                lineTo(13.844f, 5.343f)
                arcToRelative(2.986f, 2.986f, 0.0f, true, false, -3.688f, 0.0f)
                lineTo(1.917f, 17.206f)
                arcTo(4.484f, 4.484f, 0.0f, false, false, 1.443f, 21.824f)
                close()
                moveTo(16.954f, 15.079f)
                lineTo(12.842f, 21.0f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(5.814f, -8.369f)
                close()
                moveTo(19.9f, 20.434f)
                curveToRelative(-0.257f, 0.492f, -0.968f, 0.566f, -1.369f, 0.566f)
                lineTo(16.5f, 21.0f)
                lineToRelative(2.286f, -3.291f)
                lineToRelative(0.839f, 1.208f)
                arcTo(1.535f, 1.535f, 0.0f, false, true, 19.9f, 20.434f)
                close()
                moveTo(4.381f, 18.917f)
                lineTo(12.0f, 7.948f)
                lineTo(13.426f, 10.0f)
                lineTo(5.785f, 21.0f)
                lineTo(5.471f, 21.0f)
                curveToRelative(-0.4f, 0.0f, -1.112f, -0.074f, -1.369f, -0.566f)
                arcTo(1.533f, 1.533f, 0.0f, false, true, 4.381f, 18.917f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
