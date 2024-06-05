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

public val Icons.Outline.GolfClub: ImageVector
    get() {
        if (_golfClub != null) {
            return _golfClub!!
        }
        _golfClub = Builder(name = "GolfClub", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.014f, 24.0f)
                lineTo(5.119f, 24.0f)
                arcTo(5.125f, 5.125f, 0.0f, false, true, 0.0f, 18.881f)
                verticalLineToRelative(-4.8f)
                arcToRelative(5.121f, 5.121f, 0.0f, false, true, 6.174f, -5.01f)
                lineTo(20.01f, 11.98f)
                lineTo(22.018f, 0.018f)
                lineTo(23.99f, 0.349f)
                lineTo(21.4f, 15.8f)
                arcToRelative(9.335f, 9.335f, 0.0f, false, true, -0.667f, 2.511f)
                arcTo(9.518f, 9.518f, 0.0f, false, true, 12.014f, 24.0f)
                close()
                moveTo(5.114f, 10.957f)
                arcTo(3.119f, 3.119f, 0.0f, false, false, 2.0f, 14.077f)
                verticalLineToRelative(4.8f)
                arcTo(3.122f, 3.122f, 0.0f, false, false, 5.119f, 22.0f)
                horizontalLineToRelative(6.9f)
                arcTo(7.518f, 7.518f, 0.0f, false, false, 18.9f, 17.508f)
                arcToRelative(7.515f, 7.515f, 0.0f, false, false, 0.521f, -2.01f)
                lineToRelative(0.259f, -1.544f)
                lineTo(5.762f, 11.024f)
                arcTo(3.169f, 3.169f, 0.0f, false, false, 5.114f, 10.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7617f, 15.0248f)
                lineToRelative(0.4122f, -1.9571f)
                lineToRelative(10.527f, 2.2172f)
                lineToRelative(-0.4122f, 1.9571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.792f, 18.9781f)
                lineToRelative(0.4161f, -1.9562f)
                lineToRelative(6.9789f, 1.4844f)
                lineToRelative(-0.4161f, 1.9562f)
                close()
            }
        }
        .build()
        return _golfClub!!
    }

private var _golfClub: ImageVector? = null
