package me.localx.icons.rounded.filled

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

public val Icons.Filled.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.767f, 12.0f)
                lineTo(22.233f, 12.0f)
                lineToRelative(1.7f, -8.034f)
                arcToRelative(2.719f, 2.719f, 0.0f, false, false, -0.691f, -2.5f)
                arcTo(2.69f, 2.69f, 0.0f, false, false, 20.81f, 0.682f)
                reflectiveCurveTo(19.252f, 1.0f, 19.0f, 1.0f)
                arcTo(6.307f, 6.307f, 0.0f, false, true, 17.146f, 0.254f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.878f, 0.192f)
                arcTo(12.355f, 12.355f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(12.354f, 12.354f, 0.0f, false, true, 9.123f, 0.193f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.267f, 0.06f)
                arcTo(6.316f, 6.316f, 0.0f, false, true, 5.0f, 1.0f)
                curveTo(4.748f, 1.0f, 3.192f, 0.683f, 3.192f, 0.683f)
                arcToRelative(2.683f, 2.683f, 0.0f, false, false, -2.431f, 0.782f)
                arcTo(2.711f, 2.711f, 0.0f, false, false, 0.066f, 3.948f)
                close()
                moveTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(17.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
                moveTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 4.0f)
                lineTo(9.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                close()
                moveTo(8.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 21.0f)
                close()
                moveTo(22.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 21.0f)
                close()
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.033f, 5.033f, 0.0f, false, false, -8.0f, 4.0f)
                lineTo(10.0f, 21.0f)
                arcToRelative(5.032f, 5.032f, 0.0f, false, false, -8.0f, -4.0f)
                lineTo(2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
