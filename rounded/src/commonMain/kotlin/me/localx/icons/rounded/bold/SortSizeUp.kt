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

public val Icons.Bold.SortSizeUp: ImageVector
    get() {
        if (_sortSizeUp != null) {
            return _sortSizeUp!!
        }
        _sortSizeUp = Builder(name = "SortSizeUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.97f, 1.03f)
                curveToRelative(-1.36f, -1.36f, -3.59f, -1.37f, -4.92f, -0.03f)
                lineTo(0.97f, 3.91f)
                curveToRelative(-0.6f, 0.57f, -0.63f, 1.52f, -0.06f, 2.12f)
                curveToRelative(0.57f, 0.6f, 1.52f, 0.63f, 2.12f, 0.06f)
                lineToRelative(1.97f, -1.86f)
                lineTo(5.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(8.0f, 4.23f)
                lineToRelative(1.97f, 1.86f)
                curveToRelative(0.29f, 0.27f, 0.66f, 0.41f, 1.03f, 0.41f)
                curveToRelative(0.4f, 0.0f, 0.8f, -0.16f, 1.09f, -0.47f)
                curveToRelative(0.57f, -0.6f, 0.54f, -1.55f, -0.06f, -2.12f)
                lineToRelative(-3.06f, -2.88f)
                close()
            }
        }
        .build()
        return _sortSizeUp!!
    }

private var _sortSizeUp: ImageVector? = null
