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

public val Icons.Bold.SortShapesUp: ImageVector
    get() {
        if (_sortShapesUp != null) {
            return _sortShapesUp!!
        }
        _sortShapesUp = Builder(name = "SortShapesUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(23.2f, 6.58f)
                lineToRelative(-2.69f, -4.39f)
                curveToRelative(-0.4f, -0.74f, -1.17f, -1.2f, -2.01f, -1.2f)
                reflectiveCurveToRelative(-1.61f, 0.46f, -1.98f, 1.15f)
                lineToRelative(-2.74f, 4.48f)
                curveToRelative(-0.39f, 0.71f, -0.37f, 1.56f, 0.05f, 2.26f)
                reflectiveCurveToRelative(1.15f, 1.12f, 1.96f, 1.12f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.81f, 0.0f, 1.55f, -0.42f, 1.96f, -1.12f)
                reflectiveCurveToRelative(0.43f, -1.54f, 0.02f, -2.3f)
                close()
                moveTo(8.98f, 1.03f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.03f, -2.48f, -1.03f)
                reflectiveCurveToRelative(-1.81f, 0.36f, -2.44f, 1.0f)
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
                lineToRelative(-3.05f, -2.88f)
                close()
            }
        }
        .build()
        return _sortShapesUp!!
    }

private var _sortShapesUp: ImageVector? = null
