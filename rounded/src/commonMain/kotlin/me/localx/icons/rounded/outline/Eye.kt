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

public val Icons.Outline.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.271f, 9.419f)
                curveTo(21.72f, 6.893f, 18.192f, 2.655f, 12.0f, 2.655f)
                reflectiveCurveTo(2.28f, 6.893f, 0.729f, 9.419f)
                arcToRelative(4.908f, 4.908f, 0.0f, false, false, 0.0f, 5.162f)
                curveTo(2.28f, 17.107f, 5.808f, 21.345f, 12.0f, 21.345f)
                reflectiveCurveToRelative(9.72f, -4.238f, 11.271f, -6.764f)
                arcTo(4.908f, 4.908f, 0.0f, false, false, 23.271f, 9.419f)
                close()
                moveTo(21.566f, 13.534f)
                curveTo(20.234f, 15.7f, 17.219f, 19.345f, 12.0f, 19.345f)
                reflectiveCurveTo(3.766f, 15.7f, 2.434f, 13.534f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, true, 0.0f, -3.068f)
                curveTo(3.766f, 8.3f, 6.781f, 4.655f, 12.0f, 4.655f)
                reflectiveCurveToRelative(8.234f, 3.641f, 9.566f, 5.811f)
                arcTo(2.918f, 2.918f, 0.0f, false, true, 21.566f, 13.534f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
