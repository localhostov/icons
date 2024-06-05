package me.localx.icons.straight.outline

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

public val Icons.Outline.TrashCanCheck: ImageVector
    get() {
        if (_trashCanCheck != null) {
            return _trashCanCheck!!
        }
        _trashCanCheck = Builder(name = "TrashCanCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.086f, 16.414f)
                lineToRelative(-2.345f, -2.259f)
                lineToRelative(1.389f, -1.439f)
                lineToRelative(2.357f, 2.271f)
                lineToRelative(5.132f, -5.021f)
                lineToRelative(1.402f, 1.426f)
                lineToRelative(-5.113f, 5.027f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.58f, -1.406f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.586f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _trashCanCheck!!
    }

private var _trashCanCheck: ImageVector? = null
