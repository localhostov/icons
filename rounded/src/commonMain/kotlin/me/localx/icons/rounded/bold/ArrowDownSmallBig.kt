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

public val Icons.Bold.ArrowDownSmallBig: ImageVector
    get() {
        if (_arrowDownSmallBig != null) {
            return _arrowDownSmallBig!!
        }
        _arrowDownSmallBig = Builder(name = "ArrowDownSmallBig", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.97f, 17.91f)
                lineToRelative(-1.97f, 1.86f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(19.77f)
                lineToRelative(-1.97f, -1.86f)
                curveToRelative(-0.6f, -0.57f, -1.55f, -0.54f, -2.12f, 0.06f)
                curveToRelative(-0.57f, 0.6f, -0.54f, 1.55f, 0.06f, 2.12f)
                lineToRelative(3.05f, 2.88f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.48f, 1.03f)
                reflectiveCurveToRelative(1.81f, -0.36f, 2.44f, -1.0f)
                lineToRelative(3.09f, -2.91f)
                curveToRelative(0.6f, -0.57f, 0.63f, -1.52f, 0.06f, -2.12f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.63f, -2.12f, -0.06f)
                close()
            }
        }
        .build()
        return _arrowDownSmallBig!!
    }

private var _arrowDownSmallBig: ImageVector? = null
