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

public val Icons.Outline.TvRetro: ImageVector
    get() {
        if (_tvRetro != null) {
            return _tvRetro!!
        }
        _tvRetro = Builder(name = "TvRetro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 6.0f)
                horizontalLineToRelative(-6.858f)
                lineToRelative(4.575f, -4.575f)
                lineTo(17.303f, 0.011f)
                lineToRelative(-5.303f, 5.304f)
                lineTo(6.697f, 0.011f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(4.575f, 4.575f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _tvRetro!!
    }

private var _tvRetro: ImageVector? = null
