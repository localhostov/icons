package me.localx.icons.straight.filled

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

public val Icons.Filled.GolfClub: ImageVector
    get() {
        if (_golfClub != null) {
            return _golfClub!!
        }
        _golfClub = Builder(name = "GolfClub", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.018f, 0.018f)
                lineTo(20.01f, 11.98f)
                lineTo(6.174f, 9.067f)
                arcTo(5.121f, 5.121f, 0.0f, false, false, 0.0f, 14.077f)
                verticalLineToRelative(4.8f)
                arcTo(5.125f, 5.125f, 0.0f, false, false, 5.119f, 24.0f)
                horizontalLineToRelative(6.9f)
                arcToRelative(9.518f, 9.518f, 0.0f, false, false, 8.715f, -5.687f)
                arcTo(9.335f, 9.335f, 0.0f, false, false, 21.4f, 15.8f)
                lineTo(23.99f, 0.349f)
                close()
                moveTo(10.771f, 20.462f)
                lineTo(3.792f, 18.978f)
                lineToRelative(0.416f, -1.956f)
                lineToRelative(6.979f, 1.484f)
                close()
                moveTo(15.289f, 17.242f)
                lineTo(4.762f, 15.024f)
                lineToRelative(0.412f, -1.957f)
                lineTo(15.7f, 15.285f)
                close()
            }
        }
        .build()
        return _golfClub!!
    }

private var _golfClub: ImageVector? = null
