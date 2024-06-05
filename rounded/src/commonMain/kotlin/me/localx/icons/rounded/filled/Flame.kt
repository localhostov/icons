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

public val Icons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.746f, 18.254f)
                curveToRelative(0.0f, -1.5f, -1.031f, -3.55f, -2.9f, -5.773f)
                arcTo(1.088f, 1.088f, 0.0f, false, false, 12.0f, 12.092f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.117f, 1.117f, 0.0f, false, false, -0.854f, 0.391f)
                horizontalLineToRelative(0.0f)
                curveTo(9.1f, 14.88f, 8.1f, 17.0f, 8.273f, 18.625f)
                arcToRelative(3.668f, 3.668f, 0.0f, false, false, 1.582f, 2.557f)
                arcTo(3.622f, 3.622f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 15.746f, 18.254f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.629f, 2.9f)
                curveToRelative(-0.786f, -0.668f, -1.611f, -1.368f, -2.451f, -2.132f)
                arcTo(2.952f, 2.952f, 0.0f, false, false, 11.8f, 0.028f)
                arcToRelative(2.847f, 2.847f, 0.0f, false, false, -2.032f, 1.3f)
                arcTo(20.39f, 20.39f, 0.0f, false, false, 7.276f, 7.776f)
                arcTo(6.233f, 6.233f, 0.0f, false, true, 6.8f, 6.961f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.3f, -0.473f)
                arcTo(9.069f, 9.069f, 0.0f, false, false, 0.915f, 12.909f)
                arcTo(10.979f, 10.979f, 0.0f, false, false, 9.136f, 23.64f)
                arcToRelative(11.651f, 11.651f, 0.0f, false, false, 2.776f, 0.352f)
                arcToRelative(5.552f, 5.552f, 0.0f, false, true, -3.278f, -1.226f)
                arcToRelative(5.631f, 5.631f, 0.0f, false, true, -2.35f, -3.934f)
                curveToRelative(-0.23f, -2.21f, 0.893f, -4.783f, 3.338f, -7.647f)
                horizontalLineToRelative(0.0f)
                arcTo(3.114f, 3.114f, 0.0f, false, true, 12.0f, 10.092f)
                horizontalLineToRelative(0.01f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 2.366f, 1.1f)
                curveToRelative(1.538f, 1.827f, 3.373f, 4.535f, 3.373f, 7.061f)
                arcTo(5.749f, 5.749f, 0.0f, false, true, 12.39f, 23.98f)
                arcToRelative(11.056f, 11.056f, 0.0f, false, false, 10.7f, -11.065f)
                curveTo(23.085f, 8.385f, 20.093f, 5.845f, 16.629f, 2.9f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
