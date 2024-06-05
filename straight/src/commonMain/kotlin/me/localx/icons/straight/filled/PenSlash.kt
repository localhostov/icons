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

public val Icons.Filled.PenSlash: ImageVector
    get() {
        if (_penSlash != null) {
            return _penSlash!!
        }
        _penSlash = Builder(name = "PenSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.727f, 7.982f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.504f, -3.504f)
                curveToRelative(1.024f, -1.024f, 2.685f, -1.024f, 3.71f, 0.0f)
                curveToRelative(1.024f, 1.024f, 1.024f, 2.685f, 0.0f, 3.71f)
                lineToRelative(-3.504f, 3.504f)
                close()
                moveTo(18.313f, 9.396f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.751f, 3.751f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-9.395f, -9.395f)
                lineToRelative(3.751f, -3.751f)
                close()
                moveTo(0.0f, 20.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(3.71f)
                lineToRelative(8.015f, -8.015f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(0.0f, 20.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.727f, 7.982f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(3.504f, -3.504f)
                curveToRelative(1.024f, -1.024f, 2.685f, -1.024f, 3.71f, 0.0f)
                curveToRelative(1.024f, 1.024f, 1.024f, 2.685f, 0.0f, 3.71f)
                lineToRelative(-3.504f, 3.504f)
                close()
                moveTo(18.313f, 9.396f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.751f, 3.751f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-9.395f, -9.395f)
                lineToRelative(3.751f, -3.751f)
                close()
                moveTo(0.0f, 20.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(3.71f)
                lineToRelative(8.015f, -8.015f)
                lineToRelative(-3.71f, -3.71f)
                lineTo(0.0f, 20.29f)
                close()
            }
        }
        .build()
        return _penSlash!!
    }

private var _penSlash: ImageVector? = null
