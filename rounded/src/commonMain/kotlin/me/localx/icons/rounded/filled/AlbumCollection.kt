package me.localx.icons.rounded.filled

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

public val Icons.Filled.AlbumCollection: ImageVector
    get() {
        if (_albumCollection != null) {
            return _albumCollection!!
        }
        _albumCollection = Builder(name = "AlbumCollection", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.35f)
                curveToRelative(-0.28f, 0.0f, -0.55f, -0.11f, -0.75f, -0.34f)
                curveToRelative(-0.57f, -0.65f, -1.39f, -1.02f, -2.25f, -1.02f)
                lineTo(4.0f, 5.99f)
                curveToRelative(-0.86f, 0.0f, -1.68f, 0.37f, -2.25f, 1.02f)
                curveToRelative(-0.37f, 0.41f, -1.0f, 0.45f, -1.41f, 0.09f)
                curveToRelative(-0.41f, -0.37f, -0.45f, -1.0f, -0.09f, -1.41f)
                curveToRelative(0.95f, -1.08f, 2.32f, -1.69f, 3.75f, -1.69f)
                lineTo(20.0f, 4.0f)
                curveToRelative(1.43f, 0.0f, 2.8f, 0.62f, 3.75f, 1.69f)
                curveToRelative(0.37f, 0.41f, 0.33f, 1.05f, -0.09f, 1.41f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.25f, -0.66f, 0.25f)
                close()
                moveTo(23.66f, 3.1f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.09f, -1.41f)
                curveToRelative(-0.95f, -1.08f, -2.32f, -1.69f, -3.75f, -1.69f)
                lineTo(4.0f, -0.0f)
                curveTo(2.57f, 0.0f, 1.2f, 0.62f, 0.25f, 1.69f)
                curveToRelative(-0.37f, 0.41f, -0.33f, 1.05f, 0.09f, 1.41f)
                curveToRelative(0.41f, 0.36f, 1.05f, 0.33f, 1.41f, -0.09f)
                curveToRelative(0.57f, -0.65f, 1.39f, -1.02f, 2.25f, -1.02f)
                lineTo(20.0f, 1.99f)
                curveToRelative(0.86f, 0.0f, 1.68f, 0.37f, 2.25f, 1.02f)
                curveToRelative(0.2f, 0.22f, 0.47f, 0.34f, 0.75f, 0.34f)
                curveToRelative(0.23f, 0.0f, 0.47f, -0.08f, 0.66f, -0.25f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, 1.42f, -2.99f, 3.0f, -7.0f, 3.0f)
                reflectiveCurveToRelative(-7.0f, -1.58f, -7.0f, -3.0f)
                reflectiveCurveToRelative(2.99f, -3.0f, 7.0f, -3.0f)
                reflectiveCurveToRelative(7.0f, 1.58f, 7.0f, 3.0f)
                close()
                moveTo(14.5f, 16.0f)
                curveToRelative(0.0f, -0.55f, -1.12f, -1.0f, -2.5f, -1.0f)
                reflectiveCurveToRelative(-2.5f, 0.45f, -2.5f, 1.0f)
                reflectiveCurveToRelative(1.12f, 1.0f, 2.5f, 1.0f)
                reflectiveCurveToRelative(2.5f, -0.45f, 2.5f, -1.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(21.0f, 16.0f)
                curveToRelative(0.0f, -2.85f, -3.87f, -5.0f, -9.0f, -5.0f)
                reflectiveCurveTo(3.0f, 13.15f, 3.0f, 16.0f)
                reflectiveCurveToRelative(3.87f, 5.0f, 9.0f, 5.0f)
                reflectiveCurveToRelative(9.0f, -2.15f, 9.0f, -5.0f)
                close()
            }
        }
        .build()
        return _albumCollection!!
    }

private var _albumCollection: ImageVector? = null
