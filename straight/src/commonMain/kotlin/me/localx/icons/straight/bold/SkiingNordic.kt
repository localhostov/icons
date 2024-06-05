package me.localx.icons.straight.bold

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

public val Icons.Bold.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(0.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 19.5f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.01f, 21.0f)
                lineToRelative(1.844f, -8.0f)
                lineTo(4.933f, 13.0f)
                lineTo(3.088f, 21.0f)
                lineTo(4.614f, 21.0f)
                lineTo(6.3f, 16.887f)
                lineToRelative(0.533f, 0.573f)
                arcToRelative(4.414f, 4.414f, 0.0f, false, false, 0.88f, 0.755f)
                lineToRelative(1.02f, 0.644f)
                lineTo(7.854f, 21.0f)
                lineTo(12.0f, 21.0f)
                lineTo(12.0f, 19.276f)
                lineToRelative(-3.459f, -2.45f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -1.3f, -4.242f)
                lineTo(8.709f, 9.0f)
                lineTo(6.42f, 9.0f)
                lineTo(5.261f, 11.0f)
                horizontalLineToRelative(-3.1f)
                lineTo(4.987f, 6.0f)
                lineTo(12.5f, 6.0f)
                arcToRelative(3.519f, 3.519f, 0.0f, false, true, 3.0f, 1.7f)
                lineTo(17.488f, 11.0f)
                horizontalLineToRelative(1.267f)
                lineToRelative(0.424f, -1.837f)
                lineToRelative(2.923f, 0.674f)
                lineTo(19.526f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 19.5f)
                lineTo(21.0f, 19.0f)
                close()
                moveTo(15.0f, 17.724f)
                lineTo(15.0f, 21.0f)
                horizontalLineToRelative(1.447f)
                lineToRelative(1.615f, -7.0f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-2.13f, -3.539f)
                lineTo(11.885f, 15.52f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
