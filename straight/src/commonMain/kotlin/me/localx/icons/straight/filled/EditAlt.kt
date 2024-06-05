package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.EditAlt: ImageVector
    get() {
        if (_editAlt != null) {
            return _editAlt!!
        }
        _editAlt = Builder(name = "EditAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.414f)
                lineToRelative(4.414f, -4.414f)
                lineToRelative(-4.414f, 0.0f)
                lineToRelative(0.0f, 4.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.419f, 1.568f)
                arcToRelative(1.944f, 1.944f, 0.0f, false, false, -2.824f, 0.078f)
                lineToRelative(-8.76f, 9.7f)
                arcToRelative(5.031f, 5.031f, 0.0f, false, true, 2.46f, 2.093f)
                lineToRelative(9.124f, -9.124f)
                arcTo(1.943f, 1.943f, 0.0f, false, false, 23.419f, 1.568f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.982f, 15.583f)
                quadTo(15.0f, 15.79f, 15.0f, 16.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.973f, -2.329f)
                curveToRelative(0.454f, -2.726f, 2.308f, -7.257f, 6.4f, -7.644f)
                lineTo(19.105f, 0.313f)
                arcTo(4.019f, 4.019f, 0.0f, false, true, 19.418f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(6.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                reflectiveCurveToRelative(1.0f, -6.0f, 5.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _editAlt!!
    }

private var _editAlt: ImageVector? = null
