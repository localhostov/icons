package me.localx.icons.rounded.outline

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

public val Icons.Outline.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(10.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 5.0f)
                close()
                moveTo(21.0f, 5.72f)
                lineTo(21.0f, 16.177f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.326f, 3.39f)
                lineToRelative(1.25f, 3.054f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.852f, 0.757f)
                lineTo(18.0f, 20.745f)
                arcTo(13.573f, 13.573f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(13.583f, 13.583f, 0.0f, false, true, -6.0f, -1.255f)
                lineTo(4.927f, 23.378f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.851f, -0.757f)
                lineToRelative(1.249f, -3.054f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 16.177f)
                lineTo(3.0f, 5.72f)
                arcTo(4.982f, 4.982f, 0.0f, false, true, 6.475f, 0.956f)
                arcTo(18.367f, 18.367f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(18.329f, 18.329f, 0.0f, false, true, 5.525f, 0.957f)
                arcTo(4.979f, 4.979f, 0.0f, false, true, 21.0f, 5.72f)
                close()
                moveTo(19.0f, 11.737f)
                curveTo(17.447f, 14.065f, 15.05f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveToRelative(-5.447f, -1.935f, -7.0f, -4.263f)
                verticalLineToRelative(4.44f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, false, 1.512f, 2.607f)
                arcTo(11.331f, 11.331f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(11.321f, 11.321f, 0.0f, false, false, 5.487f, -1.216f)
                arcTo(2.957f, 2.957f, 0.0f, false, false, 19.0f, 16.177f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(19.0f, 5.72f)
                arcToRelative(2.988f, 2.988f, 0.0f, false, false, -2.083f, -2.858f)
                arcTo(16.364f, 16.364f, 0.0f, false, false, 12.0f, 2.0f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -4.917f, 0.861f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 5.0f, 5.72f)
                lineTo(5.0f, 6.0f)
                curveToRelative(0.0f, 2.443f, 2.645f, 8.0f, 7.0f, 8.0f)
                reflectiveCurveTo(19.0f, 8.443f, 19.0f, 6.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
