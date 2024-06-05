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

public val Icons.Outline.Insert: ImageVector
    get() {
        if (_insert != null) {
            return _insert!!
        }
        _insert = Builder(name = "Insert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.586f, 17.414f)
                lineToRelative(-4.787f, -4.701f)
                lineToRelative(1.401f, -1.427f)
                lineToRelative(3.799f, 3.731f)
                lineTo(10.999f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.008f)
                lineToRelative(3.799f, -3.721f)
                lineToRelative(1.401f, 1.427f)
                lineToRelative(-4.793f, 4.707f)
                curveToRelative(-0.386f, 0.386f, -0.895f, 0.58f, -1.405f, 0.58f)
                reflectiveCurveToRelative(-1.026f, -0.195f, -1.417f, -0.586f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _insert!!
    }

private var _insert: ImageVector? = null
