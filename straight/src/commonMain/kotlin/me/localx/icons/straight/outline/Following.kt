package me.localx.icons.straight.outline

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
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.957f)
                arcTo(2.961f, 2.961f, 0.0f, false, false, 13.043f, 16.0f)
                horizontalLineTo(4.957f)
                arcTo(2.961f, 2.961f, 0.0f, false, false, 2.0f, 18.957f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.957f)
                arcTo(4.963f, 4.963f, 0.0f, false, true, 4.957f, 14.0f)
                horizontalLineToRelative(8.086f)
                arcTo(4.963f, 4.963f, 0.0f, false, true, 18.0f, 18.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.875f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, 2.2f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, -2.2f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -2.0f, 2.2f)
                curveToRelative(0.0f, 2.3f, 4.0f, 5.133f, 4.0f, 5.133f)
                reflectiveCurveToRelative(4.0f, -2.829f, 4.0f, -5.133f)
                arcTo(2.107f, 2.107f, 0.0f, false, false, 22.0f, 7.875f)
                close()
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null
