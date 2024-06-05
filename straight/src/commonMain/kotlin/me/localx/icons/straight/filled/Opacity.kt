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

public val Icons.Filled.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.309f, 5.608f)
                lineTo(2.772f, 4.329f)
                arcTo(11.945f, 11.945f, 0.0f, false, false, 0.71f, 7.924f)
                lineToRelative(1.881f, 0.68f)
                arcTo(9.945f, 9.945f, 0.0f, false, true, 4.309f, 5.608f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, 0.148f, -1.722f)
                lineTo(0.177f, 9.936f)
                arcToRelative(12.137f, 12.137f, 0.0f, false, false, 0.0f, 4.142f)
                lineToRelative(1.97f, -0.344f)
                arcTo(10.115f, 10.115f, 0.0f, false, true, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.507f, 2.627f)
                lineTo(7.808f, 0.753f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -3.574f, 2.1f)
                lineToRelative(1.3f, 1.524f)
                arcTo(9.96f, 9.96f, 0.0f, false, true, 8.507f, 2.627f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.244f, 21.157f)
                arcToRelative(11.957f, 11.957f, 0.0f, false, false, 3.577f, 2.095f)
                lineToRelative(0.7f, -1.875f)
                arcToRelative(9.931f, 9.931f, 0.0f, false, true, -2.98f, -1.746f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6f, 15.408f)
                lineToRelative(-1.88f, 0.681f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, false, 2.066f, 3.593f)
                lineTo(4.317f, 18.4f)
                arcTo(9.97f, 9.97f, 0.0f, false, true, 2.6f, 15.408f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.107f, 12.107f, 0.0f, false, false, 9.829f, 0.2f)
                lineToRelative(0.36f, 1.968f)
                arcTo(10.033f, 10.033f, 0.0f, false, true, 12.0f, 2.0f)
                verticalLineTo(22.0f)
                arcToRelative(10.033f, 10.033f, 0.0f, false, true, -1.811f, -0.164f)
                lineTo(9.829f, 23.8f)
                arcTo(12.01f, 12.01f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
