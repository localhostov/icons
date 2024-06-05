package me.localx.icons.rounded.outline

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

public val Icons.Outline.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 3.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 5.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 9.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.875f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, 2.2f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, -2.2f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, 2.2f)
                curveToRelative(0.0f, 1.73f, 2.256f, 3.757f, 3.38f, 4.659f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 1.24f, 0.0f)
                curveToRelative(1.124f, -0.9f, 3.38f, -2.929f, 3.38f, -4.659f)
                arcTo(2.107f, 2.107f, 0.0f, false, false, 22.0f, 7.875f)
                close()
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null
