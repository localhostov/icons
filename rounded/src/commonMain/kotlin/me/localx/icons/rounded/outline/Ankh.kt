package me.localx.icons.rounded.outline

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

public val Icons.Outline.Ankh: ImageVector
    get() {
        if (_ankh != null) {
            return _ankh!!
        }
        _ankh = Builder(name = "Ankh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 14.0f)
                horizontalLineToRelative(-3.557f)
                curveToRelative(1.538f, -2.083f, 3.557f, -5.326f, 3.557f, -8.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 2.674f, 2.02f, 5.917f, 3.557f, 8.0f)
                horizontalLineToRelative(-3.557f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.425f, -2.446f, 5.972f, -4.0f, 7.898f)
                curveToRelative(-1.555f, -1.924f, -4.0f, -5.468f, -4.0f, -7.898f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _ankh!!
    }

private var _ankh: ImageVector? = null
