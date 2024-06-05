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

public val Icons.Bold.TrashCanCheck: ImageVector
    get() {
        if (_trashCanCheck != null) {
            return _trashCanCheck!!
        }
        _trashCanCheck = Builder(name = "TrashCanCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.637f, 11.028f)
                curveToRelative(0.568f, 0.604f, 0.54f, 1.553f, -0.063f, 2.12f)
                lineToRelative(-3.046f, 2.867f)
                curveToRelative(-0.661f, 0.652f, -1.541f, 0.98f, -2.424f, 0.98f)
                reflectiveCurveToRelative(-1.776f, -0.33f, -2.455f, -0.992f)
                lineToRelative(-1.167f, -1.024f)
                curveToRelative(-0.622f, -0.547f, -0.684f, -1.494f, -0.136f, -2.116f)
                curveToRelative(0.545f, -0.623f, 1.494f, -0.685f, 2.116f, -0.136f)
                lineToRelative(1.225f, 1.077f)
                curveToRelative(0.252f, 0.241f, 0.567f, 0.242f, 0.759f, 0.051f)
                lineToRelative(3.071f, -2.891f)
                curveToRelative(0.604f, -0.568f, 1.552f, -0.541f, 2.12f, 0.063f)
                close()
                moveTo(23.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.757f)
                curveToRelative(0.619f, -1.746f, 2.287f, -3.0f, 4.243f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.956f, 0.0f, 3.624f, 1.254f, 4.243f, 3.0f)
                horizontalLineToRelative(3.757f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _trashCanCheck!!
    }

private var _trashCanCheck: ImageVector? = null
